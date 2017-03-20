/**
 * @(#)CurrencyConverterGBP.java
 *
 *Eustaquio,Jarrett Harvey C.
 *Diaz, Joseph F.
 * @author 
 * @version 1.00 2017/3/19
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverterGBP extends JFrame {
	
	private JPanel inputPanel;
	private JPanel resultPanel;
	private JPanel menuPanel;
	private JPanel promptLabel;
	private JPanel resultLabel;
	private JPanel selectLabel;
	private JMenu currencyMenu;
	private JMenuBar currencyMenuBar;
	private JTextField inputField;
	private JButton convertButton;
	private JButton clearButton;
	
	private double Euros = 0.019;
	private double JapaneseYen = 2.26;
	private double SerbianDinar = 2.31;
	private double USDollar = 0.020;
	private double CanadianDollars = 0.027;
	private double AustralianDollars = 0.026;
	
	public CurrencyConverterGBP(){
		super();
		this.setSize(400,300);
		this.setLayout(new GridLayout(3,1));
		this.setTitle("Currency Converter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.selectLabel = new JLabel("Select a Currency to Convert in Peso:", JLabel.RIGHT);
		this.resultLabel = new JLabel(" ", JLabel.CENTER);
		this.resultLabel = new JLabel("(Click to select a currency)");
		JMenuItem Euros = new JMenuItem("Euros");
		Euro.addActionListener(new java.awt.event.ActionListener()
		{
			public void actioPerformed(java.awt.event.ActionEvent evt)
			{
				menuChanged(evt);
			}
		});
		this.currencyMenu.add(Euros);
		JMenuItem JapaneseYen = new JMenuItem("Japanese Yen");
		JapaneseYen.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				menuChanged(evt);
			}
		
		});
		this.currencyMenu.add(JapaneseYen);
		
		JMenuItem SerbianDinar = new JMenuItem("Serbian Dinar");
		SerbianDinar.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				menuChange(evt);
			}
		});
		this.currencyMenu.add(SerbianDinar);
		
		JMenuItem CD = new JMenuItem("Canadian Dollars");
		CD.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				menuChanged(evt);
			}
		});
		this.currencyMenu.add(USD);
		currencyMenuBar = new JMenuBar();
		currencyMenuBar.add(currencyMenu);
		this.menuPanel = new JPanel();
		this.menuPanel.add(this.selectLabel);
		this.menuPanel.add(this.currencyMenuBar);
		this.add(this.menuPanel);
		this.promptLabel = new JLabel("(Enter Amount:)",JLabel.RIGHT);
		this.resultLabel = new JLabel(" ",JLabel.CENTER);
		this.inputField = new JTextField("",12);
		this.convertButton = new JButton("Convert");
		convertButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.evet.ActionEvent evt)
			{
				buttonclicked(evt);
			}
		});
		this.inputPanel = new JPanel();
		this.inputPanel.add(this.resultLabel);
		this.add(this.resultPanel);
	}
		
		public void menuChanged(ActionEvent e){
			
			if(e.getActionCommand().equals("Euros"))
			{
				currencyMenu.setText("Euros");
			}
			if(e.getActionCommand().equals("Japanese Yen"))
			{
				currecnyMenu.setText("Japanese Yen");
			}
			if(e.getActionCommand().equals("Serbian Dinar"))
			{
				currencyMenu.setText("Serbian Dinar");
			}
			if(e.getActionCommand().equals("Australian Dollars"))
			{
				currencyMenu.setText("Australian Dollars");
			}
			if(e.getActionCommand().equals("Canadian Dollars"))
			{
				currencyMenu.setText("Canadian Dollars");
			}
			if(e.getActionCommad().equals("US Dollars"))
			{
				currencyMenu.setText("US Dollars");
			}
						
				
		}
		
		public void buttonclicked(ActionEvent evt)
		{
			if(currencyMenu.getText().equals("Euros"))
			{
				resultLabel.setText(inputField.getText() + " Peso is equivalent " + EurosToSterling() + " Euros.");
			}
			if(currencyMenu.getText().equals("Japanese Yen"))
			{
				resultLabel.setText(inputField.getText() + " Peso is equivalent " + JapaneseYenToSterling() + " Japanese Yen.");
			}
			if(currencyMenu.getText().equals("Serbian Dinar"))
			{
				resultLabel.setText(inputField.getText() + " Peso is equivalent " + SerbianDinarToSterling() + " Serbian Dinar.");
			}
			if(currencyMenu.getText().equals("Australian Dollars"))
			{
				resultLabel.setText(inputField.getText() + " Peso is equivalent " + AustralianDollarsToSterling() + " Australian Dollars.");
			}
			if(currencyMenu.getText().equals("Canadian Dollars"))
			{
				resultLbel.setText(inputFiled.getText() + " Peso is equivalent " + CanadianDollarsToSterling() + " Canadian Dollars.");
			}
			if(currencyMenu.getText().equals("US Dollars"))
			{
				resultLabel.setText(inputFiend.getText() + " Peso is equivalen " + USDollarsToSterling() + " US Dollars.");
			}
		}
		private String CanadianDollarsToSterling(){
			return null;
		}
		private String AustralianDollarsToSterling(){
			return null;
		}
		@SuppressWarnings("unused")
		private String CanadianDollars(){
			return "";
		}
		
		double EurosToSterling()
		{
			double calcTotal = Double.parseDouble(inputField.getText()) * Euros;
				return calcTotal;
		}
		double JapaneseYenToSterling()
		{
			double calcTotal = Double.parseDouble(inputField.getText()) * JapaneseYen;
				return calcTotal;
		}
		double SerbianDinarToSterling()
		{
			double calcTotal = Double.parseDouble(inputField.getText()) * SerbianDinar;
				return calcTotal;
		}
		double USDollarsToSterling()
		{
			double calcTotal = Double.parseDouble(inputFiend.getText()) * USDollars;
				return calcTotal;
		}
	
		public static void main(String[] args)
		{
			CurrencyConverterGBP CurCon = new CurrencyConverterGBP();
			CurCon.setVisible(true);
		}
		public JButton getclearButton(){
			return clearButton;
		}
		
		
		public void seclearButton(JButton convertButton){
			this.convertButton = convertButton;
		}
		
		
		public JButton getConvertButton(){
			return convertButton;
		}
		public void setConvertButton(JButton convertButton)
		{
			this.converButton = convertButton;
		}
		
		public JButton getClearButton(){
			return clearButton;
		}
		public void setClearButton(JButton clearButton)
		{
			this.clearButton = clearButton;
		}
		public double getCanadianDollars(){
			return CanadianDollars;
		}
		
		public void setCanadianDollars(double CanadianDollars){
		this.CanadianDollars = CanadianDollars;
		}
		
		public double getAustralianDollars(){
			return AustralianDollars;
		}
		public void setAustralianDollars(double AustralianDollars){
			this.AustralianDollars = AustralianDollars;
		}
		
		
		
			
}