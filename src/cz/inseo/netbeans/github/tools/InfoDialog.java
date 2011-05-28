package cz.inseo.netbeans.github.tools;

import java.awt.Dialog;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotificationLineSupport;
import org.openide.NotifyDescriptor;

/**
 *
 * @author Pavel
 */
public class InfoDialog {

	public static void showInfo(String message) {
		NotifyDescriptor d = new NotifyDescriptor.Message( message, NotifyDescriptor.INFORMATION_MESSAGE);
		DialogDisplayer.getDefault().notify(d);
	}
}
