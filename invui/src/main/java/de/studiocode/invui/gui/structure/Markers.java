package de.studiocode.invui.gui.structure;

import de.studiocode.invui.gui.AbstractPagedGui;
import de.studiocode.invui.gui.AbstractScrollGui;
import de.studiocode.invui.gui.AbstractTabGui;

/**
 * Registry class for default markers
 */
public class Markers {
    
    /**
     * The marker for horizontal content list slots in {@link AbstractPagedGui PagedGuis},
     * {@link AbstractScrollGui ScrollGuis} and {@link AbstractTabGui TabGuis}
     */
    public static final Marker CONTENT_LIST_SLOT_HORIZONTAL = new Marker(true);
    
    /**
     * The marker for vertical content list slots in {@link AbstractPagedGui PagedGuis},
     * {@link AbstractScrollGui ScrollGuis} and {@link AbstractTabGui TabGuis}
     */
    public static final Marker CONTENT_LIST_SLOT_VERTICAL = new Marker(false);
    
}