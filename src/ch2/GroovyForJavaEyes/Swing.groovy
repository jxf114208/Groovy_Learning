/**
 * ʵ�ֽӿ�
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
	//as���������൱��ʵ��
	{ JOptionPane.showMessageDialog( frame, "You Clicked!" ) } as ActionListener
)

//��ð�ţ������ָ��������ʹ���鼴�ɣ�����ʵ��ȫ������
//û��ʵ�ֵĽӿڷ��������ã����׳�NullPointerException
handleFocus = {
	focusGained : { msgLabel.setText( "Good to see you" ) }
	focusLost : { msgLabel.setText("Come back soon!") }
}
button.addFocusListener(handleFocus as FocusListener)


events = ['WindowListener', 'ComponentListener']
//������б�����Ƕ�̬�ģ� ���ҿ�������ĳЩ����
handler = { msgLabel.setText("$it") }
for(event in events) {
	//��̬�ӿ�ʹ��asType������ͨ������ʵ�ֽӿڵ�ClassԪ������Ϊһ���������͸�asType(),���԰Ѵ�����ӳ��ת��Ϊ�ӿ�
	handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
	frame."add${event}"(handlerImpl)
}

frame.show()