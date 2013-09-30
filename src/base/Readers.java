/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package base;

import javax.swing.JOptionPane;

/**
 * Class that contains readers in various forms
 * 
 * @example BaseProgram
 * 
 *          (the tag @example followed by the name of an example included in
 *          folder 'examples' will automatically include the example in the
 *          javadoc.)
 * 
 */

public class Readers
{

	public final static String VERSION = "##library.prettyVersion##";

	/**
	 * Open a dialog so that the user can enter an integer value
	 * 
	 * @return -1 in case of error, the entered number otherwise
	 */
	public static int readInt()
	{
		while (true)
		{
			try
			{
				String lInput = JOptionPane.showInputDialog("Please enter a number");
				if (lInput == null)
				{
					return -1;
				}
				return Integer.parseInt(lInput);
			}
			catch (NumberFormatException pExc)
			{
				continue;
			}
		}
	}

	/**
	 * return the version of the library.
	 * 
	 * @return String
	 */
	public static String version()
	{
		return VERSION;
	}
}
