package hr.vsite.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double _first = 0.0;
    private double _second = 0.0;
    private double _result = 0.0;
    private String _mathOperator;
    private boolean _hasNumber=false;
    private boolean _hasResult=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 38, 230, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JLabel Label1 = new JLabel("");
		Label1.setHorizontalAlignment(SwingConstants.RIGHT);
		Label1.setBounds(10, 11, 230, 27);
		contentPane.add(Label1);
		
		JButton btnPrecent = new JButton("%");
		btnPrecent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_mathOperator!=null) {
					_mathOperator="%";
					Label1.setText(_first+" % ");
					}
				else {
					_first = Double.parseDouble(textField.getText());
					_hasNumber=true;
					textField.setText("");
					Label1.setText(_first+" % ");
					_mathOperator="%";
					}
			}
		});
		btnPrecent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrecent.setBounds(10, 92, 50, 50);
		btnPrecent.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnPrecent);
		
		JButton btnOneDivX = new JButton("1/x");
		btnOneDivX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a=1/a;
				Label1.setText("1/" + Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+ a);	
			}
		});
		btnOneDivX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOneDivX.setBounds(10, 153, 50, 50);
		btnOneDivX.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnOneDivX);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnSeven.getText());					
					}
				else {
				textField.setText(textField.getText()+btnSeven.getText());
				}
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSeven.setBounds(10, 214, 50, 50);
		btnSeven.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnFour.getText());					
					}
				else {
				textField.setText(textField.getText()+btnFour.getText());
				}
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFour.setBounds(10, 275, 50, 50);
		btnFour.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnOne.getText());					
					}
				else {
				textField.setText(textField.getText()+btnOne.getText());
				}
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOne.setBounds(10, 336, 50, 50);
		btnOne.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnOne);
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a=a*(-1);
				textField.setText(""+a);
			}
		});
		btnSign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSign.setBounds(10, 397, 50, 50);
		btnSign.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSign);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCe.setBounds(70, 92, 50, 50);
		btnCe.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnCe);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				a=a*a;
				Label1.setText("sqr(" + Double.parseDouble(textField.getText())+") ");
				textField.setText("");
				textField.setText(textField.getText()+a);				
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSquare.setBounds(70, 153, 50, 50);
		btnSquare.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSquare);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnEight.getText());					
					}
				else {
				textField.setText(textField.getText()+btnEight.getText());
				}
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEight.setBounds(70, 214, 50, 50);
		btnEight.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnEight);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnFive.getText());					
					}
				else {
				textField.setText(textField.getText()+btnFive.getText());
				}
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFive.setBounds(70, 275, 50, 50);
		btnFive.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnFive);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnTwo.getText());					
					}
				else {
				textField.setText(textField.getText()+btnTwo.getText());
				}
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTwo.setBounds(70, 336, 50, 50);
		btnTwo.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnTwo);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnZero.getText());					
					}
				else {
				textField.setText(textField.getText()+btnZero.getText());
				}
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnZero.setBounds(70, 397, 50, 50);
		btnZero.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnZero);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				_result=0.0;
				_first=0.0;
				_second=0.0;
				_hasNumber=false;
			    _hasResult=false;
			    _mathOperator=null;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnC.setBounds(130, 92, 50, 50);
		btnC.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnC);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));				
				Label1.setText("\u221A(" + Double.parseDouble(textField.getText())+") ");
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSqrt.setBounds(130, 153, 50, 50);
		btnSqrt.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSqrt);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnNine.getText());					
					}
				else {
				textField.setText(textField.getText()+btnNine.getText());
				}
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNine.setBounds(130, 214, 50, 50);
		btnNine.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnNine);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnSix.getText());					
					}
				else {
				textField.setText(textField.getText()+btnSix.getText());
				}
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSix.setBounds(130, 275, 50, 50);
		btnSix.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSix);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_hasResult){
					textField.setText("");					
					_hasResult=false;
					textField.setText(textField.getText()+btnThree.getText());					
					}				
				else {
					textField.setText(textField.getText()+btnThree.getText());
				}
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThree.setBounds(130, 336, 50, 50);
		btnThree.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnThree);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					textField.setText("0.");
                }
                else if (textField.getText().contains(".")){
                	btnDecimal.setEnabled(false);
                } else {
                	textField.setText(textField.getText() + btnDecimal.getText());
                }
				btnDecimal.setEnabled(true);
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDecimal.setBounds(130, 397, 50, 50);
		btnDecimal.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnDecimal);
		
		JButton btnDelete = new JButton("\uF0E7");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					text=str.toString();
					textField.setText(text);
				}
			}
		});
		btnDelete.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnDelete.setBounds(190, 92, 50, 50);
		btnDelete.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnDelete);
		
		JButton btnDividing = new JButton("/");
		btnDividing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_mathOperator!=null){
					_mathOperator="/";
					Label1.setText(_first+" /");
					}
				else {
					_first = Double.parseDouble(textField.getText());
					_hasNumber=true;
					textField.setText("");
					Label1.setText(_first+" /");
					_mathOperator="/";
				}
			}
		});
		btnDividing.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDividing.setBounds(190, 153, 50, 50);
		btnDividing.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnDividing);
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(_mathOperator!=null){
					_mathOperator="*";
					Label1.setText(_first+" *");
					}
				else {
					_first = Double.parseDouble(textField.getText());
					_hasNumber=true;
					textField.setText("");
					Label1.setText(_first+" *");
					_mathOperator="*";
					}
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMult.setBounds(190, 214, 50, 50);
		btnMult.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnMult);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_mathOperator!=null) {
					_mathOperator="-";
					Label1.setText(_first+" -");
					}
				else {
					_first = Double.parseDouble(textField.getText());
					_hasNumber=true;
					textField.setText("");
					Label1.setText(_first+" -");
					_mathOperator="-";
					}				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSub.setBounds(190, 275, 50, 50);
		btnSub.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(_mathOperator!=null) {
					_mathOperator="+";
					Label1.setText(_first+" +");
					}
				else {
					_first = Double.parseDouble(textField.getText());
					_hasNumber=true;
					textField.setText("");
					Label1.setText(_first+" +");
					_mathOperator="+";
					}
				}			
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(190, 336, 50, 50);
		btnAdd.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(_hasNumber) {
					_second=Double.parseDouble(textField.getText());
				switch (_mathOperator) {
                case "+":
                	_result = _first + _second;
                	break;
                case "-": 
                	_result = _first - _second;
                	break;
                case "*": 
                	_result = _first * _second;
                	break;
                case "/": 
                	_result = _first / _second;
                	break;
                case "%":
                	_result = _first % _second;
                	break;
            }
				textField.setText(Double.toString(_result));
				Label1.setText(_first+" "+_mathOperator+" "+ _second);
				_mathOperator=null;				
				_first = _result;
				_hasResult = true;
				_result=0;
				}
			} catch (Exception exc) {				
				return;
			}
			}
			
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEqual.setBounds(190, 397, 50, 50);
		btnEqual.setMargin(new Insets(1,1,1,1));
		contentPane.add(btnEqual);
		
	}
}
