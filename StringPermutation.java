public class StringPermutation {
    public static void main(String[] args) {
        String s="abc";
        permute(s,0,s.length()-1);
    }

    public static void permute(String s,int l,int r) {
        if(l==r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s, l+1, r);
            s=swap(s, l, i);
        }
    }

    public static String swap(String s, int l, int i) {
        char[] c1=s.toCharArray();
        char t=s.charAt(l);
        c1[l]=c1[i];
        c1[i]=t;
        return new String(c1);
    }
}
