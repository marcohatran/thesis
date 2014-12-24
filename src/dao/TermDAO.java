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
package dao;

import dto.TermDTO;
import java.util.List;

public interface TermDAO extends BaseDAO {

    /**
     * Checks if exists a term.
     *
     * @param dto Term DTO.
     * @return True if term exists. False, if not.
     */
    public boolean existTerm(TermDTO dto);

    /**
     * Return the identificator's term from a word.
     *
     * @param word Word.
     * @return Term identificator .
     */
    public int getTermId(String word);

    /**
     * Returns all terms.
     *
     * @return List of words. The word equivalent to the term.
     */
    public List<String> getAllTerm();

}
