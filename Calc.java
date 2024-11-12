import java.util.*;
class Calc{
static void homepage(Scanner input){
	


	System.out.println("                                     __  _______             __");
	System.out.println("                                    |  \\/       \\           |  \\");
	System.out.println("                                    \\$$|  $$$$$$\\  ______  | $$  _______");
	System.out.println("                                    |  \\| $$   \\$$ |      \\ | $$ /       \\");
	System.out.println("                                    | $$| $$        \\$$$$$$\\| $$|  $$$$$$$ ");
	System.out.println("                                    | $$| $$   __  /      $$| $$| $$");
	System.out.println("                                    | $$| $$__/  \\|  $$$$$$$| $$| $$_____");
	System.out.println("                                    | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
	System.out.println("                                     \\$$  \\$$$$$$$  \\$$$$$$$ \\$$  \\$$$$$$$");
	System.out.println("");
	System.out.println("");
	System.out.println("  _   _                       _                       ______                                         _");
	System.out.println(" | \\ | |                     | |                     / _____|                                       | |");
	System.out.println(" |  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |        ___    _ __   __    __   ___   _ __  | |_    ___   _ __");
	System.out.println(" |     | | | | | | '_ '  _\\  |  _ \\   / _ \\ | '__|  | |       / _ \\  | '_ \\  \\ \\  / /  / _ \\ | '__| | __|  / _ \\ | '__|");
	System.out.println(" | |\\  | | |_| | | | | | | | | |_) | |  __/ | |     | |____  | (_) | | | | |  \\ \\/ /  |  __/ | |    | |_  |  __/ | |");
	System.out.println(" |_| \\_|  \\__,_| |_| |_| |_| |_,__/   \\___| |_|      \\_____|  \\___/  |_| |_|   \\__/    \\___| |_|     \\__|  \\___| |_|");
	System.out.println("             ");
	System.out.println("");
	System.out.println("========================================================================================================================================");
	System.out.println("");
	System.out.println("");
	System.out.println("               [01] Decimal Converter");
	System.out.println("");
	System.out.println("               [02] Binary Converter");
	System.out.println("");
	System.out.println("               [03] Octal Converter");
	System.out.println("");
	System.out.println("               [04] Hexadecimal Converter");
	System.out.println("");
	System.out.println("               [05] Roman Number Converter");
	System.out.println("");
	System.out.print("Entre Option -> ");
	int option=input.nextInt();

	if(option==1){
		decimalConverter(input);	
		
	}
 	else if (option==2){
		binaryConverter(input);		
	}

	else if (option==3){
		octalConverter(input);

	}

	else if (option==4){

		hexadecimalConverter(input);
	
	}
	else if (option==5){
		romanConverter(input);
	}

}

 static void decimalConverter(Scanner input){
System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                      Decimal Converter                            |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");
		System.out.print("Entre Decimal Number :");
		int decimal=input.nextInt();
			if(decimal>0){
				int a=decimal,b=decimal;
				String x="",y="",z="";
				while(decimal!=0){
					x=(decimal%2)+x;
					decimal/=2;
			
		
				}
			System.out.println("");
			System.out.println("           Binary number : "+x);


		
				while(a!=0){
					y=(a%8)+y;
					a/=8;
			
		
				}
				System.out.println("");
				System.out.println("           Octal number : "+y);


				while(b!=0){
					z=(b%16)+z;
					b/=16;

				}

	       			 System.out.println("");
				System.out.println("           Hexadecimal number : "+z);
			
				 System.out.println("");	
	 			 System.out.print("Do You want to go to homepage(Y/N)->");
				 String home=input.next();
				if(home.equals("Y")){
				 homepage(input);
				}else{
				decimalConverter(input);
				}
	


			}

 			else if(decimal<0){
				 System.out.println("");
				 System.out.println("         Invalid input.......");

			System.out.println("");	
	 			 System.out.print("Do You want to input number again(Y/N)->");
				 String home=input.next();
				if(home.equals("Y")){
				decimalConverter(input);
				}else{
				homepage(input);
				}

			}
}

static void binaryConverter(Scanner input){

		System.out.println("");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|                      Binary Converter                             |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("");
			System.out.print("Entre Binary Number :");
			int binary=input.nextInt();
				
				boolean valid=true;
				String abc="",cdf="";
				int power=0,total=0;
				
				while(binary!=0){
					int temp=binary%10;
					total+=temp*Math.pow(2,power);
					if(temp>1){
						valid=false;
					
					}
					binary=binary/10;
					power++;
					
				}
					int m=total;
					 

				if(valid==true){
				System.out.println("");
				 System.out.println("          Decimal Number : "+total);

				while(total!=0){
					
					abc=(total%8)+abc;
					total/=8;
			
		
				}
				System.out.println("");
				System.out.println("          Octal number : "+abc);

				while(m!=0){
					int n=m%16;
					switch(n){
					case 10 :
						cdf="A"+cdf;
						break;
					case 11 :
						cdf="B"+cdf;
						break;
					case 12 :
						cdf="C"+cdf;
						break;
					case 13 :
						cdf="D"+cdf;
						break;
					case 14 :
						cdf="E"+cdf;
						break;
					case 15 :
						cdf="F"+cdf;
						break;
					default :
						cdf=n+cdf;

					}
					
					m/=16;
			
		
				}
				System.out.println("");
				System.out.println("          Hexadecimal number : "+cdf);

				System.out.println("");	
	 			 System.out.print("Do You want to go to homepage(Y/N)->");
				 String home=input.next();
				if(home.equals("Y")){
				 homepage(input);
				}else{
				binaryConverter(input);
				}
				



				}

				
				else if(valid==false){
						 System.out.println("");
						 System.out.println("         Invalid input.......");

						System.out.println("");	
	 		        		System.out.print("Do You want to input number again(Y/N)->");
				 		String home=input.next();
					if(home.equals("Y")){
						binaryConverter(input);
					}
					else{
						homepage(input);
					}

				
				}
		

				
				




}



static void octalConverter(Scanner input){

		System.out.println("");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|                      Octal Converter                             |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("");
			System.out.print("Entre Octal Number :");
			int octal=input.nextInt();
				
				boolean valid=true;
				String abc="",cdf="";
				int power=0,total=0;
				
				while(octal!=0){
					int temp=octal%10;
					total+=temp*Math.pow(8,power);
					if(temp>7){
						valid=false;
					
					}
					octal=octal/10;
					power++;
					
				}
					int m=total;
					 

				if(valid==true){
					System.out.println("");
				 	System.out.println("          Decimal Number : "+total);

						while(total!=0){
					
							abc=(total%2)+abc;
							total/=2;
			
		
						}
					System.out.println("");
					System.out.println("          Binary number : "+abc);

					while(m!=0){
						cdf=(m%16)+cdf;
						m/=16;
			
		
					}
					System.out.println("");
					System.out.println("          Hexadecimal number : "+cdf);

					System.out.println("");	
	 				 System.out.print("Do You want to go to homepage(Y/N)->");
					 String home=input.next();
					if(home.equals("Y")){
				 		homepage(input);
					}else{
						octalConverter(input);
					}
				



				}

				
				else if(valid==false){
						 System.out.println("");
						 System.out.println("         Invalid input.......");

						System.out.println("");	
	 		        		System.out.print("Do You want to input number again(Y/N)->");
				 		String home=input.next();
					if(home.equals("Y")){
						octalConverter(input);
					}
					else{
						homepage(input);
					}

				
				}
}

static void hexadecimalConverter(Scanner input){

		System.out.println("");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|                      Hexadecimal Converter                             |");
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("");
			System.out.print("Entre Hexadecimal Number :");
			String hexadecimal=input.next();
				
				boolean valid=true;
				String cdf="",abc="";
				int power=0,total=0,m=0;

				
				for(int i=hexadecimal.length();i>0;i--){
						char x=hexadecimal.charAt(i-1);
						int temp=0;
						

					switch(x){
						case 'A':
							
						case 'a' :
							temp=10;
							break;
						case 'B' :
							
						case 'b' :
							temp=11;
							break;
						case 'C' :
							
						case 'c' :
							temp=12;
							break;
						case 'D' :
							
						case 'd' :
							temp=13;
							break;
						case 'E' :
							
						case 'e' :
							temp=14;
							break;
						case 'F' :
							
						case 'f' :
							temp=15;
							break;
						case '0' :
							temp=0;
							break;
						case '1' :
							temp=1;
							break;
						case '2' :
							temp=2;
							break;
						case '3' :
							temp=3;
							break;
						case '4' :
							temp=4;
							break;
						case '5' :
							temp=5;
							break;
						case '6' :
							temp=6;
							break;
						case '7' :
							temp=7;
							break;
						case '8' :
							temp=8;
							break;
						case '9' :
							temp=9;
							break;
						default :
							temp=16;

					}

					total+=temp*Math.pow(16,power);
					System.out.println(temp);
					if(temp>15){
						valid=false;
					
					}
						power++;
						
															

			}
				m=total;

				if(valid==true){
					System.out.println("");
				 	System.out.println("          Decimal Number : "+total);

						while(total!=0){
					
							abc=(total%2)+abc;
							total/=2;
			
		
						}
					System.out.println("");
					System.out.println("          Binary number : "+abc);

					while(m!=0){
						cdf=(m%8)+cdf;
						m/=8;
			
		
					}
					System.out.println("");
					System.out.println("          Octal number : "+cdf);

					System.out.println("");	
	 				 System.out.print("Do You want to go to homepage(Y/N)->");
					 String home=input.next();
					if(home.equals("Y")){
				 		homepage(input);
					}else{
						hexadecimalConverter(input);
					}
				



				}

				
				else if(valid==false){
						 System.out.println("");
						 System.out.println("         Invalid input.......");

						System.out.println("");	
	 		        		System.out.print("Do You want to input number again(Y/N)->");
				 		String home=input.next();
					if(home.equals("Y")){
						hexadecimalConverter(input);
					}
					else{
						homepage(input);
					}

				
				}

		
}



 static void romanConverter(Scanner input){
System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                      Roman Number Converter                       |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");
		System.out.println("");
		System.out.println("     [01] Decimal Number to Roman Number Converter");
		System.out.println("");
		System.out.println("     [02] Roman Number to Decimal Number Converter");
		System.out.println("");
		System.out.println("");
		System.out.print("Enter an option :");
			int option=input.nextInt();


		if(option==1){
			decimalToRomanConverter(input);
		}else if(option==2){
			romanToDecimalConverter(input);
		}

		


}

static void decimalToRomanConverter(Scanner input){
System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                  Decimal Number to Roman Number Converter         |");
		System.out.println("+-------------------------------------------------------------------+");

		System.out.println("");	
		System.out.print("Enter an Decimal Number :");
			int decimal=input.nextInt();
			String answer="";
			while(decimal!=0){
				
				String roman=getRomanNumber(decimal);
				int number=getNumber(decimal);

				decimal-=number;

				answer+=roman;

			}
				System.out.println("");
				System.out.println("       Roman number : "+answer);


				System.out.println("");	
	 				 System.out.print("Do You want to go to homepage(Y/N)->");
					 String home=input.next();
					if(home.equals("Y")){
				 		homepage(input);
					}else{
						decimalToRomanConverter(input);
					}


}



static void romanToDecimalConverter(Scanner input){
System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                  Roman Number to Decimal Number Converter         |");
		System.out.println("+-------------------------------------------------------------------+");

		System.out.println("");	
		System.out.print("Enter a Roman  Number :");
			String roman=input.next();
			int answer=0;

				for(int i=0;i<roman.length();i++){
					int temp=i,second=0;;
					char x=roman.charAt(temp);
					int first=getDecimalNumber(x);
					if(i!=(roman.length()-1) ){
						char y=roman.charAt(temp+1);
						second=getDecimalNumber(y);
						if(first<second){
							answer=second-first;
							i++;
						}else{
							answer+=first;
						}
					}else{
						answer+=first;
					}

					
				}				
			
				System.out.println("");
				System.out.println("       Decimal number : "+answer);


				System.out.println("");	
	 				 System.out.print("Do You want to go to homepage(Y/N)->");
					 String home=input.next();
					if(home.equals("Y")){
				 		homepage(input);
					}else{
						romanToDecimalConverter(input);
					}


}


static String getRomanNumber(int number){
	if(number>=1 && number<5){
		return "I"; 
	}
	else if(number>=5 && number<10){
		return "V";
	}
	else if(number>=10 && number<50){
		return "X";
	}
	else if(number>=50 && number<100){
		return "L";
	}
	else if(number>=100 && number<500){
		return "C";
	}
	else if(number>500 && number<1000){
		return "D";
	}
	else if(number>=1000){
		return "M";
	}
	else{
		return "";
	}

} 



static int getNumber(int number){
	if(number>=1 && number<5){
		return 1; 
	}
	else if(number>=5 && number<10){
		return 5;
	}
	else if(number>=10 && number<50){
		return 10;
	}
	else if(number>=50 && number<100){
		return 50;
	}
	else if(number>=100 && number<500){
		return 100;
	}
	else if(number>500 && number<1000){
		return 500;
	}
	else if(number>=1000){
		return 1000;
	}
	else{
		return 0;
	}

}


static int getDecimalNumber(char c){
		if(c=='I'){
			return 1;
		}
		else if(c=='V'){
			return 5;
		}
		else if(c=='X'){
			return 10;
		}
		else if(c=='L'){
			return 50;
		}
		else if(c=='C'){
			return 100;
		}
		else if(c=='D'){
			return 500;
		}
		else if(c=='M'){
			return 1000;
		}
		else{
			return 0;
		}

} 

	public static void main(String args[]){
	
		Scanner input=new Scanner(System.in);
		homepage(input);
		
		
		
	}

		
}