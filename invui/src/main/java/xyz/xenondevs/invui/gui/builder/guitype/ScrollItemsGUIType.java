package xyz.xenondevs.invui.gui.builder.guitype;

import org.jetbrains.annotations.NotNull;
import xyz.xenondevs.invui.gui.ScrollGui;
import xyz.xenondevs.invui.gui.builder.GuiContext;
import xyz.xenondevs.invui.gui.impl.ScrollItemsGuiImpl;
import xyz.xenondevs.invui.item.Item;

class ScrollItemsGuiType implements GuiType<ScrollGui<Item>, Item> {
    
    @Override
    public @NotNull ScrollItemsGuiImpl createGui(@NotNull GuiContext<Item> context) {
        ScrollItemsGuiImpl gui = new ScrollItemsGuiImpl(context.getContent(), context.getStructure());
        gui.setBackground(context.getBackground());
        return gui;
    }
    
}