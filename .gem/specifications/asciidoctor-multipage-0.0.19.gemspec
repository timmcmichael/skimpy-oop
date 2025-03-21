# -*- encoding: utf-8 -*-
# stub: asciidoctor-multipage 0.0.19 ruby lib

Gem::Specification.new do |s|
  s.name = "asciidoctor-multipage".freeze
  s.version = "0.0.19".freeze

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.metadata = { "bug_tracker_uri" => "https://github.com/owenh000/asciidoctor-multipage/issues", "homepage_uri" => "https://github.com/owenh000/asciidoctor-multipage", "source_code_uri" => "https://github.com/owenh000/asciidoctor-multipage" } if s.respond_to? :metadata=
  s.require_paths = ["lib".freeze]
  s.authors = ["Owen T. Heisler".freeze]
  s.date = "2023-12-18"
  s.description = "An Asciidoctor extension that generates HTML output using multiple pages".freeze
  s.email = ["writer@owenh.net".freeze]
  s.executables = ["asciidoctor-multipage".freeze]
  s.files = ["bin/asciidoctor-multipage".freeze]
  s.homepage = "https://github.com/owenh000/asciidoctor-multipage".freeze
  s.licenses = ["MIT".freeze]
  s.required_ruby_version = Gem::Requirement.new(">= 2.5".freeze)
  s.rubygems_version = "3.3.15".freeze
  s.summary = "Asciidoctor multipage HTML output extension".freeze

  s.installed_by_version = "3.5.22".freeze

  s.specification_version = 4

  s.add_development_dependency(%q<appraisal>.freeze, [">= 0".freeze])
  s.add_development_dependency(%q<bundler>.freeze, [">= 2.2.18".freeze])
  s.add_development_dependency(%q<minitest>.freeze, ["~> 5".freeze])
  s.add_development_dependency(%q<rake>.freeze, ["~> 13".freeze])
  s.add_runtime_dependency(%q<asciidoctor>.freeze, [">= 2.0.11".freeze, "< 2.1".freeze])
end
