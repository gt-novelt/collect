package ch.novelt.gts.odk.collect.android.widgets;

import androidx.annotation.NonNull;

import ch.novelt.gts.odk.collect.android.widgets.base.GeneralSelectMultiWidgetTest;

/**
 * @author James Knight
 */

public class ListMultiWidgetTest extends GeneralSelectMultiWidgetTest<ListMultiWidget> {
    @NonNull
    @Override
    public ListMultiWidget createWidget() {
        return new ListMultiWidget(activity, formEntryPrompt, true);
    }
}