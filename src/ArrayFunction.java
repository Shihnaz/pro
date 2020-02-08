import javax.swing.*;// this is example of string concatination and array and introduction to gui
public class ArrayFunction {

	public static void main(String[] args) { 
	int a[]= {5,6,7,8,9,10,11,12,17,19,20};
	String sh="j\tA[J]\n"; int j=0;
	
	for(int f:a) {sh+=j+"\t"+f+"\n";j++;}
	JTextArea w=new JTextArea(sh);
	JOptionPane.showMessageDialog(null, w, "this is my new work", JOptionPane.INFORMATION_MESSAGE);
	
	}}
