<!DOCTYPE html>
<%@page import="java.util.jar.Attributes.Name"%>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Documentenverwaltung</title>
		<style type="text/css" media="screen">

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

		
			#page-body {
				margin: 1em 1em 1em 2em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
	
		<div id="page-body" role="main">
			<h1>Doumentenverwaltung</h1>

			<div id="controller-list" role="navigation">
				<h2>Welche Objekte möchten sie anlegen?</h2>
				<ul>
					<g:each var="c" in="${grailsApplication.domainClasses.sort { it.fullName } }">
						<li class="domain">
							<g:link controller="${c.logicalPropertyName}">
								${c.toString().subSequence(11, c.toString().length())}
							</g:link>
						</li>
					</g:each>	
			
					

				</ul>
			</div>
		</div>
	</body>
</html>
