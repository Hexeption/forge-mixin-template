package uk.co.hexeption.template.connector;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

/**
 * MixinConnector
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 06/03/2020 - 05:41 pm
 */
public class MixinConnector implements IMixinConnector {

    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.template.json");
    }
}
