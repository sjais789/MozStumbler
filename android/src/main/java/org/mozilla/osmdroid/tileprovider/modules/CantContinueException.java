/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.osmdroid.tileprovider.modules;

/**
 * Thrown by a tile provider module in TileLoader.loadTile() to signal that it can no longer
 * function properly. This will typically clear the pending queue.
 */
public class CantContinueException extends Exception {
    private static final long serialVersionUID = 146526524087765133L;

    public CantContinueException(final String pDetailMessage) {
        super(pDetailMessage);
    }

    public CantContinueException(final Throwable pThrowable) {
        super(pThrowable);
    }
}
