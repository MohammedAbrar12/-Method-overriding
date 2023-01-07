class Whatsupp_w1
{
void status()
{
System.out.println("status with text");
}}
class Whatsupp_w2 extends Whatsupp_w1
{
void status()
{
System.out.println("status with text,audio and videos");
}}
class Mainclass
{
public static void main(String[]args)
{
Whatsupp_w2 v1=new Whatsupp_w2();
v1.status();
}}
