           <!-- Show details of the course -->
		   <div class="messages"></div>
            <div id="summary" class="">
                <h3>${title}</h3>
                {if !hide}
                <table width="100%">
                	<tr>
                        <th>
                            Lecturer(s)
                        </th>
                        <td>
                            {for presenter in presenters}
								{if presenter.email}
									<a href="mailto:${presenter.email}">${presenter.name}</a>
								{else}
									${presenter.name}
								{/if}
							{/for}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Module Administrator
                        </th>
                        <td>
                        	{for administrator in administrators}
                        		{if administrator.email}
									<a href="mailto:${administrator.email}">${administrator.name}</a>
								{else}
									${administrator.name}
								{/if}
							{/for}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Department
                        </th>
                        <td>
                        	{if defined('department')}
                            	${department}
							{else}
								${departmentCode}
							{/if}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Signup Available
                        </th>
                        <td>
							{if signup}
							    {if signup == "full" || waiting}
							    	Waiting List of ${waiting}
							    {else}
                            		${signup} 
                            	{/if}
							{else}
								Not bookable
							{/if}		
                        </td>
                    </tr>
                    
                    {if categories_rdf.length > 0}
                    	<tr>
                        	<th>
                            	Skills Categories
                        	</th>
                        	<td>
								{for category in categories_rdf}
									${category}{if category_index != categories_rdf.length-1},{/if}
								{/for}
                        	</td>
                    	</tr>
                    {/if}
                    
                    {if categories_jacs.length > 0}
                    	<tr>
                        	<th>
                            	Subject categories
                        	</th>
                        	<td>
								{for category in categories_jacs}
									${category}{if category_index != categories_jacs.length-1},{/if}
								{/for}
                        	</td>
                    	</tr>
                    {/if}
                    
                    {if categories_rm.length > 0}
                    	<tr>
                        	<th>
                            	Research Methods
                        	</th>
                        	<td>
								{for category in categories_rm}
									${category}{if category_index != categories_rm.length-1},{/if}
								{/for}
                        	</td>
                    	</tr>
                    {/if}
                    
                </table>
                {/if}
            </div>
            
			<div id="description">
            	<h4>Description</h4>
				${description}
            </div>
			<div id="parts">
                <h4>Module Parts</h4>
				<span class="error" style="display:none"></span>
                <form id="signup" action="#">
                    <table width="100%">
                    	{for part in parts}
                    	{if part.subject}
							<tr>
                            	<th colspan="3">
                            		${part.subject}
                            	</th>
                        	</tr>
                        {/if}
                        {if !hide}
                        	<tr>
                            	<td colspan="3">
                                	&nbsp;&nbsp;${part.type.name}
                            	</td>
                        	</tr>
							{var oneOpen = false}
							{for option in part.options}
                        	<tr>
                            	<td class="option-details">
                                	<label for="option-${option.id}">
                                		{if option.slot}${option.slot} for 
                                	{else}
                                		For
                                	{/if}
                                	${option.sessions} sessions starts in ${option.when}, 
									{if option.presenter}{if option.presenter.email}<a href="mailto:${option.presenter.email}">{/if}${option.presenter.name}{if option.presenter.email}</a>{/if}{/if}
									</label>
                                	<br/>
                                	<span class="location">
                                		{if option.starts}teaching starts on ${new Date(option.starts).toDateString()}{/if}
                                		{if option.ends} and ends on ${new Date(option.ends).toDateString()}{/if}
                                		{if option.location}
                                			{if option.starts || option.ends}<br/>{/if}
                                			${option.location}
                                		{/if}
                                	</span>
                            	</td>
                            	<td style="width:6em">
                            		{if option.bookable}
                            			{if option.full}
											full
										{else}
											{if waiting}
												Waiting List (${waiting})
											{else}
												${option.places} of ${option.size} places
											{/if}
										{/if}
									{/if}
                            	</td>
                            	<td>
									{if option.signup && option.signup.status != "WITHDRAWN"}
										Signup: ${option.signup.status}
									{else}
										{if signup}
                                			{if part.options.length == 1}
												<input type="checkbox" name="${part.type.id}" id="option-${option.id}" value="${option.id}" 
												{if !option.open }disabled="true"{else}{var oneOpen = true}checked="yes"{/if}/>
											{else}
                								<input type="radio" name="${part.type.id}" id="option-${option.id}" value="${option.id}"
												{if !option.open }disabled="true"{else}{var oneOpen = true}{/if}/>
											{/if}
								 		{/if}
									{/if}	
                            	</td>
                        	</tr>
							{/for}
							{if parts.length > 1 && part.options.length > 1 && oneOpen}
							<tr>
								<td class="option-details">
									<label for="option-none-${part.type.id}">Nothing for this option</label>
								</td>
								<td>N/A</td>
								<td><input type="radio" name="${part.type.id}" id="option-none-${part.type.id}" value="none"/></td>
							</tr>
							{/if}
							{/for}
						{/if}
                    </table>
                    {if !hide}
						{if signup}
							{if full || waiting}
								<input type="submit" value="Join Waiting List" />
							{else}
								<input type="submit" value="Signup" {if !open}disabled="true"{/if}/>
							{/if}
						{else}
							<input type="submit" value="Not Bookable">
						{/if}
						
					{else}
						<p>To see more details you must login.<br />
						   Non Oxford users cannot be given a username.</p>
					
						{if defined('contactEmail')}
							<a href="mailto:${contactEmail}">Make an Enquiry</a>
						{/if}
					{/if}
					
                </form>
            </div>
            {if isAdmin}
            	<div id="directLink">
            		<h4>Direct Link</h4> 
					${url}
            	</div>
            {/if}
    