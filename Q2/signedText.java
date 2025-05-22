public class SignedText{
  private String first;
  private String last;

  public signedText(String first, String last){
    this.first = first;
    this.last = last;
  }

  public String getSigniture(){
    if (first.equals(null)){
      return last;
    }
    return (first.substring(0,1) + "-" + last);
  }
  public String addSigniture(String str){
    if (str.indexOf(getSigniture()) == 0){
      return str.substring(getSigniture().length) + getSigniture();
    }
    else if (str.indexOf(getSigniture()) == -1){
      return str + getSigniture();
    }
    return str;
  }
}
