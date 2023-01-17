class pr {
    public static void main(String[] args) {
        String s="24";
        String s2="23";
        String s3="5";
        int  c=6;
        double sum;


        double ss=Double.parseDouble(s);
        System.out.println("s="+s);

        float ss2=Float.parseFloat(s2);
        System.out.println("s2="+s2);

        int ss3=Integer.parseInt(s3);
        System.out.println("s3="+s3);

        // Integer.parseInt(si);
        // System.out.println("d="+d);


        switch (c) {
            case 1:
                sum = ss+ss2;
                System.out.println(ss+"+"+ss2+"="+sum);
                break;  
            case 2:
                sum = ss2-ss;
                System.out.println(ss2+"-"+ss+"="+sum);
                break;
            case 3:
                sum = ss3*ss2;
                System.out.println(ss3+"x"+ss2+"="+sum);
                break;
            case 4:
                sum = ss/ss3;
                System.out.println(ss+"/"+ss3+"="+sum);
                break;
            case 5:
                int sa =ss3;
                for (int j = 1; j < sa ; j++) {
                    ss3=ss3*j;
                }
                System.out.println("factorial ="+ss3);
                 break;

            case 6:
                sum= ss2*ss2;
                System.out.println(ss2+"^2 = "+sum);
                break;   
            default:
                System.out.println("NOT");
                break;
        }
    } 
}