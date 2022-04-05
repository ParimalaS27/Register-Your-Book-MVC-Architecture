import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
    // View uses Swing framework to display UI to user
    private JFrame frame;
    private JLabel BNameLabel;
    private JLabel AuthorLabel;
    private JLabel EditionLabel;
    private JLabel CategoryLabel;
    private JLabel PriceLabel;
    private JLabel QtyLabel;
    private JTextField BNameTextfield;
    private JTextField AuthorTextfield;
    private JTextField EditionTextfield;
    private JTextField CategoryTextfield;
    private JTextField PriceTextfield;
    private JTextField QtyTextfield;
    private JButton SaveButton;
    private JButton View;
    private JButton Quit;

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        BNameLabel = new JLabel("Book Name :");
        AuthorLabel = new JLabel("Author :");
        EditionLabel = new JLabel("Edition :");
        CategoryLabel = new JLabel("Category :");
        PriceLabel = new JLabel("Price(/Book) :");
        QtyLabel = new JLabel("Quantity in Stock :");
        BNameTextfield = new JTextField();
        AuthorTextfield = new JTextField();
        EditionTextfield = new JTextField();
        CategoryTextfield = new JTextField();
        PriceTextfield = new JTextField();
        QtyTextfield = new JTextField();
        SaveButton = new JButton("Save Details");
        View = new JButton("View Details");
        Quit = new JButton("Quit!");
        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(BNameLabel)
                        .addComponent(AuthorLabel).addComponent(EditionLabel).addComponent(CategoryLabel)
                        .addComponent(PriceLabel).addComponent(QtyLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(BNameTextfield)
                        .addComponent(AuthorTextfield).addComponent(EditionTextfield).addComponent(CategoryTextfield)
                        .addComponent(PriceTextfield).addComponent(QtyTextfield)
                        .addComponent(View)
                        .addComponent(Quit)
                        .addComponent(SaveButton)));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(BNameLabel)
                        .addComponent(BNameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(AuthorLabel)
                        .addComponent(AuthorTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(EditionLabel)
                        .addComponent(EditionTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(CategoryLabel)
                        .addComponent(CategoryTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(PriceLabel)
                        .addComponent(PriceTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(QtyLabel)
                        .addComponent(QtyTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(SaveButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(View))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Quit)));

        layout.linkSize(SwingConstants.HORIZONTAL, SaveButton);
        layout.linkSize(SwingConstants.HORIZONTAL, View, Quit);
        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getBNameLabel() {
        return BNameLabel;
    }

    public void setBNameLabel(JLabel BNameLabel) {
        this.BNameLabel = BNameLabel;
    }

    public JLabel getAuthorLabel() {
        return AuthorLabel;
    }

    public void setAuthorLabel(JLabel AuthorLabel) {
        this.AuthorLabel = AuthorLabel;
    }

    public JLabel getEditionLabel() {
        return EditionLabel;
    }

    public void setEditionLabel(JLabel EditionLabel) {
        this.EditionLabel = EditionLabel;
    }

    public JLabel getCategoryLabel() {
        return CategoryLabel;
    }

    public void setCategoryLabel(JLabel CategoryLabel) {
        this.CategoryLabel = CategoryLabel;
    }

    public JLabel getPriceLabel() {
        return PriceLabel;
    }

    public void setPriceLabel(JLabel PriceLabel) {
        this.PriceLabel = PriceLabel;
    }

    public JLabel getQtyLabel() {
        return QtyLabel;
    }

    public void setQtyLabel(JLabel QtyLabel) {
        this.QtyLabel = QtyLabel;
    }

    public JTextField getBNameTextfield() {
        return BNameTextfield;
    }

    public void setBNameTextfield(JTextField BNameTextfield) {
        this.BNameTextfield = BNameTextfield;
    }

    public JTextField getAuthorTextfield() {
        return AuthorTextfield;
    }

    public void setAuthorTextfield(JTextField AuthorTextfield) {
        this.AuthorTextfield = AuthorTextfield;
    }

    public JTextField getEditionTextfield() {
        return EditionTextfield;
    }

    public void setEditionTextfield(JTextField EditionTextfield) {
        this.EditionTextfield = EditionTextfield;
    }

    public JTextField getCategoryTextfield() {
        return CategoryTextfield;
    }

    public void setCategoryTextfield(JTextField CategoryTextfield) {
        this.CategoryTextfield = CategoryTextfield;
    }

    public JTextField getPriceTextfield() {
        return PriceTextfield;
    }

    public void setPriceTextfield(JTextField PriceTextfield) {
        this.PriceTextfield = PriceTextfield;
    }

    public JTextField getQtyTextfield() {
        return QtyTextfield;
    }

    public void setQtyTextfield(JTextField QtyTextfield) {
        this.QtyTextfield = QtyTextfield;
    }

    public JButton getSaveButton() {
        return SaveButton;
    }

    public void setSaveButton(JButton SaveButton) {
        this.SaveButton = SaveButton;
    }

    public JButton getView() {
        return View;
    }

    public void setView(JButton View) {
        this.View = View;
    }

    public JButton getQuit() {
        return Quit;
    }

    public void setQuit(JButton Quit) {
        this.Quit = Quit;
    }
}