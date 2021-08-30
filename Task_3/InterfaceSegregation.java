// interface Conversion{
//     public void intToDouble();
//     public void intToChar();
//     public void charToString();
// }


interface ConvertIntToDouble{
    public void intToDouble();
}

interface ConvertIntToChar{
    public void intToChar();
}

interface ConvertCharToString{
    public void charToString();
}

class IntConversion implements ConvertIntToChar, ConvertIntToDouble{
    public void intToDouble(){
        System.out.println("Int converted to Double");
    }
    public void intToChar(){
        System.out.println("Int converted to Char");
    }
}

class InterfaceSegregation{
     public static void main(String[] args) {
        IntConversion obj = new IntConversion();
        obj.intToChar();
        obj.intToDouble();
    }
}