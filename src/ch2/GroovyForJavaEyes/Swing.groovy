/**
 * 实现接口
 */

import java.awt.FlowLayout
import java.awt.Frame;
import java.awt.event.ActionListener
import java.awt.event.FocusListener;

import javax.swing.JButton
import javax.swing.JFormattedTextField.FocusLostHandler;
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JOptionPane

frame = new JFrame(size: [30, 30], layout: new FlowLayout(), defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)
button = new JButton("click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add(button)
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel

button.addActionListener(
	//as操作符，相当于实现
	{ JOptionPane.showMessageDialog( frame, "You Clicked!" ) } as ActionListener
)

//用冒号（：）分隔方法名和代码块即可，不必实现全部方法
//没有实现的接口方法被调用，会抛出NullPointerException
handleFocus = {
	focusGained : { msgLabel.setText( "Good to see you" ) }
	focusLost : { msgLabel.setText("Come back soon!") }
}
button.addFocusListener(handleFocus as FocusListener)


events = ['WindowListener', 'ComponentListener']
//上面的列表可能是动态的， 而且可能来自某些输入
handler = { msgLabel.setText("$it") }
for(event in events) {
	//动态接口使用asType方法，通过将欲实现接口的Class元对象作为一个参数发送给asType(),可以把代码块或映射转化为接口
	handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
	frame."add${event}"(handlerImpl)
}

frame.show()