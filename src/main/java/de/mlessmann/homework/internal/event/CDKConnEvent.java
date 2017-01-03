package de.mlessmann.homework.internal.event;

import de.mlessmann.homework.api.event.ICDKConnectionEvent;
import de.mlessmann.homework.api.event.network.ConnectionStatus;

/**
 * Created by magnus.lessmann on 16.12.2016.
 */
public class CDKConnEvent extends CDKEvent implements ICDKConnectionEvent {

    private ConnectionStatus status;

    public CDKConnEvent(Object sender, ConnectionStatus status) {
        super(sender);
        this.status = status;
    }

    @Override
    public ConnectionStatus getStatus() {
        return status;
    }
}
