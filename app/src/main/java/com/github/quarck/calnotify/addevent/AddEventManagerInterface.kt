//
//   Calendar Notifications Plus
//   Copyright (C) 2017 Sergey Parshin (s.parshin.sc@gmail.com)
//
//   This program is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation; either version 3 of the License, or
//   (at your option) any later version.
//
//   This program is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License for more details.
//
//   You should have received a copy of the GNU General Public License
//   along with this program; if not, write to the Free Software Foundation,
//   Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
//

package com.github.quarck.calnotify.addevent

import android.content.Context
import com.github.quarck.calnotify.addevent.storage.NewEventRecord

interface AddEventManagerInterface {

    /**
     * Returns true on usccess, and 'event' is updated with the eventId of newly created
     * event
     * @param [context] - Android context
     * @param [event] - new event struct to create
     */
    fun createEvent(context: Context, event: NewEventRecord): Boolean
}