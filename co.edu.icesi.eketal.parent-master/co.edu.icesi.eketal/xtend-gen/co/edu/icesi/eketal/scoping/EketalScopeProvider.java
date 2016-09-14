/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal.scoping;

import co.edu.icesi.eketal.eketal.Automaton;
import co.edu.icesi.eketal.eketal.EketalPackage;
import co.edu.icesi.eketal.eketal.Rc;
import co.edu.icesi.eketal.eketal.Step;
import co.edu.icesi.eketal.scoping.AbstractEketalScopeProvider;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class EketalScopeProvider extends AbstractEketalScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((context instanceof Rc)) {
      boolean _equals = Objects.equal(reference, EketalPackage.Literals.RC__STATE);
      if (_equals) {
        Automaton _automaton = ((Rc)context).getAutomaton();
        final EList<Step> candidates = _automaton.getSteps();
        return Scopes.scopeFor(candidates);
      }
    }
    return super.getScope(context, reference);
  }
}
