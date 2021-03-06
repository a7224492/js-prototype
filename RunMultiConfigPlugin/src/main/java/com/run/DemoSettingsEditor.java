package com.run;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;

/**
 * @author jiangzhen
 */
public class DemoSettingsEditor extends SettingsEditor<DemoRunConfiguration>
{
	private JPanel myPanel;
	private LabeledComponent<ComponentWithBrowseButton> myMainClass;

	@Override
	protected void resetEditorFrom(DemoRunConfiguration demoRunConfiguration) {

	}

	@Override
	protected void applyEditorTo(DemoRunConfiguration demoRunConfiguration) throws ConfigurationException
	{

	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		return myPanel;
	}

	private void createUIComponents() {
		myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
		myMainClass.setComponent(new TextFieldWithBrowseButton());
	}
}
