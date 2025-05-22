public class SignedText {
    private String first;
    private String last;

    public SignedText(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getSignature() {
        if (first == null) {
            return last;
        }
        return (first.substring(0, 1) + "-" + last);
    }

    public String addSignature(String str) {
        String signature = getSignature();
        if (str.startsWith(signature)) {
            return str.substring(signature.length()) + signature;
        } else if (!str.contains(signature)) {
            return str + signature;
        }
        return str;
    }
}
