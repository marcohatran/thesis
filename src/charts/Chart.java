/**
 * Copyright (C) 2014 Martín Pacheco.
 *
 * This file is part of my Thesis aplication called "Extraction and Analysis
 * System of Topics for Software History Reports". Faculty of Exact Sciences of
 * the UNICEN University. Tandil, Argentine. http://www.exa.unicen.edu.ar/
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Email: mpacheco@alumnos.exa.unicen.edu.ar
 *
 * @author Martín Pacheco
 */
package charts;

import org.jfree.chart.ChartPanel;

public abstract class Chart {

    /**
     * Sets the chart's title.
     *
     * @param title Text for title of the chart.
     */
    public abstract void setTitle(String title);

    /**
     * Sets the label for the axis
     *
     * @param label Text for label.
     */
    public abstract void setYLabel(String label);

    /**
     * Sets the preferred size of this component. If preferredSize is null, the
     * UI will be asked for the preferred size.
     *
     * @param x Width.
     * @param y Height.
     */
    public abstract void setPreferredSize(int x, int y);

    /**
     * Return the chart panel.
     *
     * @return Chart panel.
     */
    public abstract ChartPanel getGraphicPanel();

    public  abstract void destroy();

}
