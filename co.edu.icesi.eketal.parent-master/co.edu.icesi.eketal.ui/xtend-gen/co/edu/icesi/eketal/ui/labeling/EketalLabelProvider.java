/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class EketalLabelProvider extends XbaseLabelProvider {
  @Inject
  public EketalLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
