import javax.swing.*;
        import javax.swing.text.MaskFormatter;
        import java.awt.*;
        import java.text.ParseException;
        import javax.swing.JFormattedTextField;
        import javax.swing.JLabel;
        import javax.swing.JFrame;

        import javax.swing.text.MaskFormatter;
        import java.util.concurrent.CopyOnWriteArrayList;


public class FramesPainels extends JFrame{

    private static final long  serialVersionUID = 1L;

    public static void main(String[] args) {

        FramesPainels field = new FramesPainels();
        field.testFormatedTextField();

    }

    private void testFormatedTextField(){
        Container janela = getContentPane();
        setLayout(null);
        /* Dados do cliente*/
        JLabel labelTitle = new JLabel("Aluguel de Veículos");
        JLabel labelDados = new JLabel("Dados do Cliente");
        JLabel labelNomeCliente = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");

        /* Dados do carro*/
        JLabel labelDadosCarro = new JLabel("Dados do Carro");
        JLabel labelNomeCarro = new JLabel("Nome: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDtaLoc = new JLabel("Data de Locação: ");
        JLabel labelDtaEnt = new JLabel("Data da Entrega: ");


        /* Dados do cliente*/
        labelTitle.setBounds(50,40,100,20);
        labelDados.setBounds(50,80,100,20);
        labelNomeCliente.setBounds(50,120,100,20);
        labelCpf.setBounds(50,160,100,20);
        labelTel.setBounds(50,200,100,20);

        /* Dados do carro*/
        labelDadosCarro.setBounds(50,240,100,20);
        labelNomeCarro.setBounds(50,280,100,20);
        labelPlaca.setBounds(50,320,100,20);
        labelAno.setBounds(50,360,100,20);
        labelDtaLoc.setBounds(50,400,100,20);
        labelDtaEnt.setBounds(50,440,100,20);


        MaskFormatter mascaraNomeCliente= null;
        MaskFormatter mascaraCpf= null;
        MaskFormatter mascaraTel= null;

        MaskFormatter mascaranomeCarro= null;
        MaskFormatter mascaraPlaca= null;
        MaskFormatter mascaraAno= null;
        MaskFormatter mascaraDtaLoc= null;
        MaskFormatter mascaraDtaEnt= null;


        try{
            mascaraNomeCliente = new MaskFormatter("UUUUUUUUUUUUUU");
            mascaraCpf = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)#####-####");

            mascaranomeCarro = new MaskFormatter("UUUUUUUUUUUUUU");
            mascaraPlaca = new MaskFormatter("####-####");
            mascaraAno = new MaskFormatter("####");
            mascaraDtaLoc = new MaskFormatter("##/##/####");
            mascaraDtaEnt = new MaskFormatter("##/##/####");

            mascaraNomeCliente.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');

            mascaranomeCarro.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDtaLoc.setPlaceholderCharacter('_');
            mascaraDtaEnt.setPlaceholderCharacter('_');


        }
        catch (ParseException excp){
            System.err.println("Erro na formatação " + excp.getMessage());
            System.exit(-1);
        }


        JFormattedTextField jFormattedTextNomeCliente = new JFormattedTextField(mascaraNomeCliente);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);

        JFormattedTextField jFormattedNomeCarro = new JFormattedTextField(mascaranomeCarro);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDtaLoca = new JFormattedTextField(mascaraDtaLoc);
        JFormattedTextField jFormattedTextDtaEnt = new JFormattedTextField(mascaraDtaEnt);


        jFormattedTextNomeCliente.setBounds(200,120,100,20);
        jFormattedTextCpf.setBounds(200,160,100,20);
        jFormattedTextTel.setBounds(200,200,100,20);

        jFormattedNomeCarro.setBounds(200,280,100,20);
        jFormattedTextPlaca.setBounds(200,320,100,20);
        jFormattedTextAno.setBounds(200,360,100,20);
        jFormattedTextDtaLoca.setBounds(200,400,100,20);
        jFormattedTextDtaEnt.setBounds(200,440,100,20);


        janela.add(labelTitle);
        janela.add(labelDados);
        janela.add(labelNomeCliente);
        janela.add(labelCpf);
        janela.add(labelTel);

        janela.add(labelDadosCarro);
        janela.add(labelNomeCarro);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDtaLoc);
        janela.add(labelDtaEnt);

        janela.add(jFormattedTextNomeCliente);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextTel);

        janela.add(jFormattedNomeCarro);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextDtaLoca);
        janela.add(jFormattedTextDtaEnt);

        setSize(800 , 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);





    }

}
