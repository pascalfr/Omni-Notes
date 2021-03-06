/*
 * Copyright (C) 2013-2019 Federico Iosue (federico@iosue.it)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.feio.android.omninotes.utils.notifications;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.os.Build;
import it.feio.android.omninotes.OmniNotes;
import it.feio.android.omninotes.R;
import java.util.ArrayList;
import java.util.List;

@TargetApi(Build.VERSION_CODES.O)
public class NotificationChannels {

  private static List<NotificationChannel> channels = new ArrayList<NotificationChannel>() {{
    add(new NotificationChannel(NotificationManager.IMPORTANCE_DEFAULT, NotificationChannelNames.Backups.getChannelId(),
        OmniNotes.getAppContext().getString(R.string
            .channel_backups_name), OmniNotes.getAppContext().getString(R.string
        .channel_backups_description)));
    add(new NotificationChannel(NotificationManager.IMPORTANCE_DEFAULT, NotificationChannelNames.Reminders.getChannelId(),
        OmniNotes.getAppContext().getString(R.string
            .channel_reminders_name), OmniNotes.getAppContext().getString(R.string
        .channel_reminders_description)));
  }};

  public static List<NotificationChannel> getChannels () {
    return channels;
  }

  public enum NotificationChannelNames {
    Backups, Reminders;

    String getChannelId() {
      return name();
    }

  }
}
