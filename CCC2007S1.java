    package CCCPractice;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class CCC2007S1 {
        public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int year = 2007-18;
            int month = 2;
            int day = 27;

            int n = Integer.parseInt(reader.readLine());

            for(int i=0;i<n;i++){
                String[] s = reader.readLine().split(" ");
                int y = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                int d = Integer.parseInt(s[2]);

                if(y<year) System.out.println("Yes");
                else if(y>year) System.out.println("No");
                else{
                    if(m<month) System.out.println("Yes");
                    else if(m>month) System.out.println("No");
                    else{
                        if(d<day) System.out.println("Yes");
                        else if(d>day) System.out.println("No");
                        else{
                            System.out.println("Yes");
                        }
                    }
                }
            }
        }
    }
