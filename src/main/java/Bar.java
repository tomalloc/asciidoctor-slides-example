public class Bar {
  private static boolean isCreated = false;

  private static Bar bar=new Bar();
  private Bar(){
    if(isCreated){
      throw new IllegalStateException("无效的访问");
    }
    isCreated=true;
  }

  public Bar instance(){
    return bar;
  }
}
