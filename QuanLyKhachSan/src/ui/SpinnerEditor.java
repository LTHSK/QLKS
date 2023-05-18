package ui;


import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {
    private final JSpinner spinner;

    public SpinnerEditor() {
        spinner = new JSpinner();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        spinner.setValue(value);
        return spinner;
    }

    public Object getCellEditorValue() {
        return spinner.getValue();
    }
}