import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		//Auto Generated Method stub
		String[] topic={"Health","Cars","Gym","Money","Animals"}; 
	       int[][] responses=new int[5][11];
	       for(int i=0;i<4;i++){
	           for(int j=1;j<=10;j++){
	               responses[i][j]=0; 
	           }
	       }
	       int peoples;
	       System.out.print("Enter number of people taking the survery:"); 
	       Scanner sc=new Scanner(System.in);
	       peoples=sc.nextInt();
	       int i=1;
	       while(i<=peoples){
	           for(int j=0;j<5;j++){ 
	               System.out.print("P"+i+":"+topic[j]+":");
	               int x=sc.nextInt();
	               responses[j][x]=responses[j][x]+1;
	           }
	           i++;
	       }
	       System.out.println("Topics "+"ratingTotal "+"ratingAverage");
	       int max_p=0,min_p=100000,max_topic=0,min_topic=0;
	       for(i=0;i<5;i++)
	       {
	           int total=0,count=0;
	           for(int j=1;j<=10;j++)
	           {
	               total=total+j*responses[i][j]; 
	               count=count+responses[i][j]; 
	           }
	           if(max_p<total)
	           {  
	               max_p=total;
	               max_topic=i;
	           }
	           if(min_p>total)
	           {  
	               min_p=total;
	               min_topic=i;
	           }
	           System.out.println(topic[i]+" "+total+" "+(total+0.0)/count);
	       }
	       System.out.println("Highest Rated Topic "+"Rating");
	       System.out.println(topic[max_topic]+" "+max_p);
	       System.out.println("Lowest Rated Topic "+"Rating");
	       System.out.println(topic[min_topic]+" "+min_p);
	   }
	}

	


