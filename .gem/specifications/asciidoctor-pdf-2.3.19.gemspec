# -*- encoding: utf-8 -*-
# stub: asciidoctor-pdf 2.3.19 ruby lib

Gem::Specification.new do |s|
  s.name = "asciidoctor-pdf".freeze
  s.version = "2.3.19".freeze

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.metadata = { "bug_tracker_uri" => "https://github.com/asciidoctor/asciidoctor-pdf/issues", "changelog_uri" => "https://github.com/asciidoctor/asciidoctor-pdf/blob/main/CHANGELOG.adoc", "mailing_list_uri" => "http://discuss.asciidoctor.org", "source_code_uri" => "https://github.com/asciidoctor/asciidoctor-pdf" } if s.respond_to? :metadata=
  s.require_paths = ["lib".freeze]
  s.authors = ["Dan Allen".freeze, "Sarah White".freeze]
  s.date = "2024-10-11"
  s.description = "An add-on converter for Asciidoctor that converts AsciiDoc documents to PDF using the Prawn PDF generation library.".freeze
  s.email = "dan@opendevise.com".freeze
  s.executables = ["asciidoctor-pdf".freeze, "asciidoctor-pdf-optimize".freeze]
  s.files = ["bin/asciidoctor-pdf".freeze, "bin/asciidoctor-pdf-optimize".freeze]
  s.homepage = "https://asciidoctor.org/docs/asciidoctor-pdf".freeze
  s.licenses = ["MIT".freeze]
  s.rubygems_version = "3.5.16".freeze
  s.summary = "Converts AsciiDoc documents to PDF using Asciidoctor and Prawn".freeze

  s.installed_by_version = "3.5.22".freeze

  s.specification_version = 4

  s.add_runtime_dependency(%q<asciidoctor>.freeze, ["~> 2.0".freeze])
  s.add_runtime_dependency(%q<prawn>.freeze, ["~> 2.4.0".freeze])
  s.add_runtime_dependency(%q<ttfunk>.freeze, ["~> 1.7.0".freeze])
  s.add_runtime_dependency(%q<matrix>.freeze, ["~> 0.4".freeze])
  s.add_runtime_dependency(%q<prawn-table>.freeze, ["~> 0.2.0".freeze])
  s.add_runtime_dependency(%q<prawn-templates>.freeze, ["~> 0.1.0".freeze])
  s.add_runtime_dependency(%q<prawn-svg>.freeze, ["~> 0.34.0".freeze])
  s.add_runtime_dependency(%q<prawn-icon>.freeze, ["~> 3.0.0".freeze])
  s.add_runtime_dependency(%q<concurrent-ruby>.freeze, ["~> 1.1".freeze])
  s.add_runtime_dependency(%q<treetop>.freeze, ["~> 1.6.0".freeze])
  s.add_development_dependency(%q<rake>.freeze, ["~> 13.0.0".freeze])
  s.add_development_dependency(%q<rspec>.freeze, ["~> 3.12.0".freeze])
  s.add_development_dependency(%q<pdf-inspector>.freeze, ["~> 1.3.0".freeze])
  s.add_development_dependency(%q<chunky_png>.freeze, ["~> 1.4.0".freeze])
end
