package cn.nukkit.event.vehicle;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.player.Player;

public class EntityExitVehicleEvent extends VehicleEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    private final Entity riding;

    public EntityExitVehicleEvent(Entity riding, Entity vehicle) {
        super(vehicle);
        this.riding = riding;
    }

    public Entity getEntity() {
        return riding;
    }

    public boolean isPlayer() {
        return riding instanceof Player;
    }

}
