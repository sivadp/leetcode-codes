import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder num=new StringBuilder();
        for(int a:digits){
            num.append(a);
        }
        BigInteger BigInt=new BigInteger(num.toString());
        BigInt=BigInt.add(BigInteger.ONE);
        String BigStr=BigInt.toString();
        char[] charArr=BigStr.toCharArray();
        int[] digitArr=new int[charArr.length];
        for(int i=0;i<digitArr.length;i++){
            digitArr[i]=Character.getNumericValue(charArr[i]);
        }
        return digitArr;
    }
}