package org.xtext.example.mydsl4.ui;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;


//Source: https://www.eclipse.org/forums/index.php/t/282129/

public class URDFDocumentProvider extends XtextDocumentProvider{
	private static final String XTEXT_FORMAT_ACTION_COMMAND_ID = "org.eclipse.xtext.ui.FormatAction";

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
		throws CoreException {
		// auto-format
		IHandlerService service = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
			try {
				service.executeCommand(XTEXT_FORMAT_ACTION_COMMAND_ID, null);
			} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
				((Throwable) e).printStackTrace();
			}
			
			// save
			super.doSaveDocument(monitor, element, document, overwrite);
		}
	
}