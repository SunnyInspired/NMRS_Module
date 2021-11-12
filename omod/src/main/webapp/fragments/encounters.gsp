<table>
        <tr>
            <th>Encounter Id</th>
            <th>Encounter Date</th>
        </tr>
          <% if (encounters) { %>
             <% encounters.each { %>
              <tr>
                <td>${ ui.format(it.encounterId) }</td>
                <td>${ ui.format(it.encounterDatetime) }</td>
              </tr>
            <% } %>
            <% } else { %>
            <tr>
                    <td colspan="2">${ ui.message("general.none") }</td>
          </tr>
            <% } %>
 </table>
