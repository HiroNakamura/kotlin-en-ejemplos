package chapter1


import javax.swing.JOptionPane

fun Int.triple():Int{
    return this * 3
}

fun Int.esMayor():Boolean{
    return this >= 18;
}

fun input_dato():String{
	return JOptionPane.showInputDialog("Introduce algo:")
}

fun print_dato(dato:String):Unit{
	JOptionPane.showMessageDialog(null, dato)
	System.exit(0)
}