package rst.pdfbox.layout.elements.render;

import java.io.IOException;

/**
 * A render listener is called before and after a page has been rendered. It may
 * be used, to perform some custom operations (drawings) to the page.
 *
 */
public interface RenderListener {

	/**
	 * Called before any rendering is performed to the page.
	 * @param renderContext
	 */
	void beforePage(final RenderContext renderContext) throws IOException;

	/**
	 * Called after any rendering is performed to the page.
	 * @param renderContext
	 */
	void afterPage(final RenderContext renderContext) throws IOException;
}
