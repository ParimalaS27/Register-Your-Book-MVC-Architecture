import javax.swing.JOptionPane;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }

    public void initView() {
        view.getBNameTextfield().setText(model.getBName());
        view.getAuthorTextfield().setText(model.getAuthor());
        view.getEditionTextfield().setText(model.getEdition());
        view.getCategoryTextfield().setText(model.getCategory());
        view.getPriceTextfield().setText(String.valueOf(model.getPrice()));
        view.getQtyTextfield().setText(String.valueOf(model.getStock_qty()));
    }

    public void initController() {
        view.getSaveButton().addActionListener(e -> saveName());
        view.getView().addActionListener(e -> sayView());
        view.getQuit().addActionListener(e -> sayQuit());
    }

    private void saveName() {
        model.setBName(view.getBNameTextfield().getText());
        model.setAuthor(view.getAuthorTextfield().getText());
        model.setEdition(view.getEditionTextfield().getText());
        model.setCategory(view.getCategoryTextfield().getText());
        model.setPrice(Double.valueOf(view.getPriceTextfield().getText()));
        model.setStock_qty(Integer.valueOf(view.getQtyTextfield().getText()));

        int code = model.actionPerformed(view.getBNameTextfield().getText(),
                view.getAuthorTextfield().getText(),
                view.getEditionTextfield().getText(), view.getCategoryTextfield().getText(),
                Double.valueOf(view.getPriceTextfield().getText()),
                Integer.valueOf(view.getQtyTextfield().getText()));

        // int code = 1;
        if (code == 1) {
            JOptionPane.showMessageDialog(null,
                    "Succesfully saved details",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Registration Unsuccessful",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void sayView() {
        JOptionPane.showMessageDialog(null,
                "Book Name : " + model.getBName() + "\nAuthor : " + model.getAuthor()
                        + "\nEdition : " + model.getEdition()
                        + "\nCategory : " + model.getCategory()
                        + "\nPrice : " + String.valueOf(model.getPrice())
                        + "\nStock Quantity : " + String.valueOf(model.getStock_qty()),
                "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void sayQuit() {
        System.exit(0);
    }
}