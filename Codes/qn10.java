import java.util.*;

public class qn10 {
    public int check(String s,int x){
        ArrayList<String> eq = new ArrayList<>(Arrays.asList(s.split("")));
        ArrayList<String> stackop = new ArrayList<>();
        ArrayList<Integer> stackn = new ArrayList<>();
        ArrayList<String> operand = new ArrayList<String>(Arrays.asList("+-*/()x".split("")));
        int n=0;
        for(char a: s.toCharArray()){
                try{
                    if(Character.toString(a).equals("x")){
                        stackn.add(x);
                    }
                    else{
                        n=Integer.parseInt(Character.toString(a));
                        stackn.add(n);
                    }
                }catch(Exception e){
                    if(operand.contains(Character.toString(a))){
                    String op= Character.toString(a);
                    
                    if(stackop.size()==0){
                        stackop.add(op);
                    }
                    else if(op.equals("/")){
                        if((stackop.get(stackop.size()-1).equals("/"))){
                            int num=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("*"))){
                            int num=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else{
                            stackop.add(op);
                        }
                    }
                    else if(op.equals("*")){
                        if((stackop.get(stackop.size()-1).equals("*"))){
                            int num=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("/"))){
                            
                            int num=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        
                        else{
                            stackop.add(op);
                        }
                    }

                    else if(op.equals("+")){
                        if((stackop.get(stackop.size()-1).equals("+"))){
                            int num=stackn.get(stackn.size()-2)+stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("-"))){
                            
                            int num=stackn.get(stackn.size()-2)-stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("/"))){
                            
                            int num=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }

                        else if((stackop.get(stackop.size()-1).equals("*"))){
                            
                            int num=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        
                        
                        else{
                            stackop.add(op);
                        }
                    }
                    else if(op.equals("-")){
                        if((stackop.get(stackop.size()-1).equals("+"))){
                            int num=stackn.get(stackn.size()-2)+stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("-"))){
                            
                            int num=stackn.get(stackn.size()-2)-stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        else if((stackop.get(stackop.size()-1).equals("/"))){
                            
                            int num=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }

                        else if((stackop.get(stackop.size()-1).equals("*"))){
                            
                            int num=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.remove(stackn.size()-1);
                            stackn.add(num);
                            stackop.remove(stackop.size()-1);
                            stackop.add(op);
                        }
                        
                        
                        else{
                            stackop.add(op);
                        }
                    }
                    else if(op.equals("(")){
                        stackop.add(op);
                    }
                    else if(op.equals(")")){
                        while(!stackop.get(stackop.size()-1).equals("(")){
                            switch(stackop.get(stackop.size()-1)){
                                case "+":
                                    n=stackn.get(stackn.size()-2)+stackn.get(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.add(n);
                                    break;
                                case "-":
                                    n=stackn.get(stackn.size()-2)-stackn.get(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.add(n);
                                    break;
                                case "*":
                                    n=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.add(n);
                                    break;
                                case "/":
                                    n=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.remove(stackn.size()-1);
                                    stackn.add(n);
                                    break;
                            }
                            stackop.remove(stackop.size()-1);
                        }
                        stackop.remove(stackop.size()-1);

                    }
                    
                }
            }
        }
        while(stackop.size()!=0){
            switch(stackop.get(stackop.size()-1)){
                case "+":
                    n=stackn.get(stackn.size()-2)+stackn.get(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.add(n);
                    break;
                case "-":
                    n=stackn.get(stackn.size()-2)-stackn.get(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.add(n);
                    break;
                case "*":
                    n=stackn.get(stackn.size()-2)*stackn.get(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.add(n);
                    break;
                case "/":
                    n=stackn.get(stackn.size()-2)/stackn.get(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.remove(stackn.size()-1);
                    stackn.add(n);
                    break;
                case ")":
                    break;
            }
            stackop.remove(stackop.size()-1);
        }
        return stackn.get(stackn.size()-1);

    }

    public static void main(String arg[]){
        qn10 obj = new qn10();
        boolean fg=true;
        int i=0;
        Scanner in = new Scanner(System.in);
        String eqn = in.nextLine();
        int r=in.nextInt();
        int d=in.nextInt();
        int result;
        while(fg){
            result=obj.check(eqn,i);
            if((result%d)==r ){
                System.out.println(i);
                fg=false;
                break;
            }
            i++;
        }
    }
    
}
