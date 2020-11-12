class Player{
int player_id;
String player_name;
int[] player_scores=new int[3];
int player_no_matches_played;
int sum=0,avg;
Player(int id,String name,int[] scores,int no_matches_played){
player_id=id;
player_name=name;
player_scores=scores;
player_no_matches_played=no_matches_played;
}
int Average(int[] player_scores){
for(int i=0;i<3;i++)
sum=sum+player_scores[i];
avg=sum/3;
System.out.println("Average Score:"+avg);
return avg;
}
}
class Test{
public static void main(String args[]){
int[] sp1={100,90,80};
int[] sp2={0,17,3};
Player p1=new Player(1,"San",sp1,3);
Player p2=new Player(2,"Ann",sp2,3);
if(p1.Average(sp1)>p2.Average(sp2)){
System.out.println("Player 1 has a higher average!");
System.out.println(p1.player_id);
System.out.println(p1.player_name);
System.out.println(p1.player_no_matches_played);
}
else{
System.out.println("Player 1 has a higher average!");
System.out.println(p1.player_id);
System.out.println(p1.player_name);

System.out.println(p1.player_no_matches_played);
}
}
}



