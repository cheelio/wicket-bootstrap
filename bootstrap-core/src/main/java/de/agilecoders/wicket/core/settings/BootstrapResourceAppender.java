package de.agilecoders.wicket.core.settings;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.BootstrapBaseBehavior;
import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.BootstrapResourcesBehavior;
import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.application.IComponentInstantiationListener;

/**
 * Appends a {@link BootstrapBaseBehavior} to all new {@link Page}
 * instances. As default {@link BootstrapResourcesBehavior} is used.
 *
 * @author miha
 */
public class BootstrapResourceAppender implements IComponentInstantiationListener {

    private final BootstrapBaseBehavior behavior;

    /**
     * This constructor uses js and css bootstrap resources
     */
    public BootstrapResourceAppender() {
        this(BootstrapResourcesBehavior.instance());
    }

    /**
     * Construct.
     *
     * @param behavior the behavior that should be added to all new pages
     */
    public BootstrapResourceAppender(BootstrapBaseBehavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void onInstantiation(Component component) {
        if (component instanceof Page) {
            component.add(behavior);
        }
    }
}
