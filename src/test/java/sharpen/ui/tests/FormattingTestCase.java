package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class FormattingTestCase extends AbstractConversionTestCase {

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        super.runResourceTestCase(configuration, "formattings/" + resourceName);
    }

    @Test
    public void testIndentStyleEgyptianBrackets() throws Throwable {
        Configuration configuration = configuration();
        configuration.enableIndentStyleEgyptianBrackets();
        runResourceTestCase(configuration, "IndentStyleEgyptianBrackets");
    }

}
