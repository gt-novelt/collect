package ch.novelt.gts.odk.collect.android.support;

import ch.novelt.gts.odk.collect.android.application.Collect;
import ch.novelt.gts.odk.collect.android.injection.config.AppDependencyComponent;
import ch.novelt.gts.odk.collect.android.injection.config.AppDependencyModule;
import ch.novelt.gts.odk.collect.android.injection.config.DaggerAppDependencyComponent;
import org.robolectric.RuntimeEnvironment;

public class RobolectricHelpers {

    private RobolectricHelpers() {}

    public static void overrideAppDependencyModule(AppDependencyModule appDependencyModule) {
        AppDependencyComponent testComponent = DaggerAppDependencyComponent.builder()
                .application(RuntimeEnvironment.application)
                .appDependencyModule(appDependencyModule)
                .build();
        ((Collect) RuntimeEnvironment.application).setComponent(testComponent);
    }

    public static AppDependencyComponent getApplicationComponent() {
        return ((Collect) RuntimeEnvironment.application).getComponent();
    }
}
