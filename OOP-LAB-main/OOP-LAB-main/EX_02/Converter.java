package converter;
public class Converter{
public double convert(int from,int to,double value){
double litres;
if(from==1){
litres=value;}
else if(from==2){
litres=value*3.78541;}
else if(from==3){
litres=value*4.54609;}
else if(from==4){
litres=value*100.0;}
else{
litres=0;
}
double result;
if(to==1){
result=litres;
}
else if(to==2){
result=litres/3.78541;}
else if(to==3){
result=litres/4.54609;}
else if(to==4){
result=litres/1000.0;}
else{
result=0;}
return result;}
}
