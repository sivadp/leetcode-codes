class Solution {
    Map<Character, Integer> mapper = new HashMap<>();
    {
        mapper.put('0', 0);
        mapper.put('1', 1);
        mapper.put('2', 2);
        mapper.put('3', 3);
        mapper.put('4', 4);
        mapper.put('5', 5);
        mapper.put('6', 6);
        mapper.put('7', 7);
        mapper.put('8', 8);
        mapper.put('9', 9);
    }
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        int num1len=num1.length();
        int num2len=num2.length();
        int extra=0;
        int minlen=Math.min(num1len,num2len);
        int maxlen=Math.max(num1len,num2len);
        StringBuilder multiplyer=new StringBuilder();
        StringBuilder constmul=new StringBuilder();
        if(minlen==num1len){
            multiplyer.append(num1);
            constmul.append(num2);
        }
        else{
            multiplyer.append(num2);
            constmul.append(num1);
        }
        for(int i=minlen,count=0;i>0;i--,count++){
            StringBuilder currentres=multiplyerFunc(constmul,mapper.get(multiplyer.charAt(i-1)));
            int preCount=count;
            while(preCount!=0){
                currentres.insert(currentres.length(),0);
                preCount--;
            }
            result=adder(result,currentres);
        }
    return result.toString();
    }       
    private StringBuilder multiplyerFunc(StringBuilder constmul,int ele1){
        int extra=0;
        StringBuilder currentStr=new StringBuilder();
        for(int i=constmul.length()-1;i>=0;i--){
            int ele2=mapper.get(constmul.charAt(i));
            int mul=ele2*ele1+extra;
            if(mul>9){
                extra=mul/10;
                currentStr.insert(0,mul%10);
            }
            else{
                extra=0;
                currentStr.insert(0,mul);
            }
        }
        if(extra>0){
            currentStr.insert(0,extra);
        }
        return currentStr;
    }
    
    private StringBuilder adder(StringBuilder num1, StringBuilder num2) {
         StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? (num1.charAt(i) - '0') : 0;
            int digit2 = (j >= 0) ? (num2.charAt(j) - '0') : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);

            i--;
            j--;
        }

        return result;
    }
}