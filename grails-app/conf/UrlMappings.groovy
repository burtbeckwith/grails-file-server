class UrlMappings {

	static mappings = {
		"500"(view:'/error')
        "/download/$root/$path**"(controller: "download", action: "index")
	}
}
