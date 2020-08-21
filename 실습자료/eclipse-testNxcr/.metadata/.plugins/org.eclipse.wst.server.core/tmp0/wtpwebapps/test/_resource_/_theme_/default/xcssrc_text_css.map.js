(function()
{
	return function()
	{
		nexacro._setCSSMaps(
		{
			"Button" :
			{
				"self" :
				{
					"enabled" :
					{
						"font" : nexacro.FontObject("normal 14pt /normal \"Arial\"")
					}
				}
			},
			"Static" :
			{
				"self" :
				{
					"enabled" :
					{
						"font" : nexacro.FontObject("bold 16pt \"Arial\"")
					},
					"mouseover" :
					{
						"color" : nexacro.ColorObject("white")
					}
				}
			}
		}
		);

		var imgcache = nexacro._getImageCacheMaps();
		
	};
}
)();
