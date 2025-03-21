# -*- encoding: utf-8 -*-
# stub: pygments.rb 3.0.0 ruby lib

Gem::Specification.new do |s|
  s.name = "pygments.rb".freeze
  s.version = "3.0.0".freeze

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.metadata = { "bug_tracker_uri" => "https://github.com/pygments/pygments.rb/issues", "changelog_uri" => "https://github.com/pygments/pygments.rb/blob/master/CHANGELOG.adoc", "documentation_uri" => "https://www.rubydoc.info/gems/pygments.rb", "homepage_uri" => "https://github.com/pygments/pygments.rb", "source_code_uri" => "https://github.com/pygments/pygments.rb" } if s.respond_to? :metadata=
  s.require_paths = ["lib".freeze]
  s.authors = ["Aman Gupta".freeze, "Ted Nyman".freeze, "Marat Radchenko".freeze]
  s.date = "2024-05-14"
  s.description = "pygments.rb is a Ruby wrapper for Pygments syntax highlighter".freeze
  s.email = ["marat@slonopotamus.org".freeze]
  s.homepage = "https://github.com/pygments/pygments.rb".freeze
  s.licenses = ["MIT".freeze]
  s.required_ruby_version = Gem::Requirement.new(">= 2.6.0".freeze)
  s.rubygems_version = "3.5.9".freeze
  s.summary = "pygments wrapper for ruby".freeze

  s.installed_by_version = "3.5.22".freeze

  s.specification_version = 4

  s.add_development_dependency(%q<rake>.freeze, ["~> 13.2.0".freeze])
  s.add_development_dependency(%q<rubocop>.freeze, ["~> 1.28.2".freeze])
  s.add_development_dependency(%q<test-unit>.freeze, ["~> 3.6.0".freeze])
end
